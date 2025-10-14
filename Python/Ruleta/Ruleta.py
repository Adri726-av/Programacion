import tkinter as tk
from tkinter import messagebox
from PIL import Image, ImageTk
import random
import threading
import time

class RuletaCasino:
    def __init__(self, root):
        self.root = root
        self.root.title("Ruleta de Casino")
        self.root.geometry("700x600")
        self.root.resizable(False, False)

        self.saldo = 1000
        self.apuestas = {}  # dict {numero: monto}

        self.ficha_actual = 0

        self.cargar_imagenes()
        self.construir_interfaz()

    def cargar_imagenes(self):
        original = Image.open(r"C:\Users\alumno11\Desktop\Programacion\Python\Ruleta\ruleta.jpg").resize((250, 250))
        self.ruleta_original = original
        self.ruleta_img = ImageTk.PhotoImage(original)

    def construir_interfaz(self):
        # Saldo
        self.label_saldo = tk.Label(self.root, text=f"Saldo: ${self.saldo}", font=("Arial", 16))
        self.label_saldo.pack(pady=10)

        # Imagen de ruleta
        self.canvas = tk.Canvas(self.root, width=250, height=250)
        self.canvas.pack()
        self.ruleta_canvas = self.canvas.create_image(125, 125, image=self.ruleta_img)

        # Fichas
        frame_fichas = tk.Frame(self.root)
        frame_fichas.pack(pady=10)

        for valor in [20, 40, 50, 100]:
            tk.Button(frame_fichas, text=f"${valor}", width=6, height=2,
                      command=lambda v=valor: self.seleccionar_ficha(v)).pack(side=tk.LEFT, padx=5)

        self.label_ficha = tk.Label(self.root, text="Ficha seleccionada: $0", font=("Arial", 12))
        self.label_ficha.pack(pady=5)

        # Números (0–36)
        self.frame_numeros = tk.Frame(self.root)
        self.frame_numeros.pack()

        self.botones_numeros = {}
        for i in range(37):
            b = tk.Button(self.frame_numeros, text=str(i), width=3, command=lambda n=i: self.agregar_apuesta(n))
            b.grid(row=i//10, column=i % 10, padx=2, pady=2)
            self.botones_numeros[i] = b

        # Girar
        self.boton_girar = tk.Button(self.root, text="Girar Ruleta", font=("Arial", 14), command=self.girar_ruleta)
        self.boton_girar.pack(pady=20)

        self.resultado = tk.Label(self.root, text="", font=("Arial", 14))
        self.resultado.pack()

    def seleccionar_ficha(self, valor):
        self.ficha_actual = valor
        self.label_ficha.config(text=f"Ficha seleccionada: ${valor}")

    def agregar_apuesta(self, numero):
        if self.ficha_actual == 0:
            messagebox.showwarning("Ficha no seleccionada", "Selecciona una ficha antes de apostar.")
            return
        if self.saldo < self.ficha_actual:
            messagebox.showwarning("Sin saldo", "No tienes saldo suficiente.")
            return

        self.apuestas[numero] = self.apuestas.get(numero, 0) + self.ficha_actual
        self.saldo -= self.ficha_actual
        self.label_saldo.config(text=f"Saldo: ${self.saldo}")
        self.botones_numeros[numero].config(bg="yellow")

    def girar_ruleta(self):
        if not self.apuestas:
            messagebox.showinfo("Sin apuestas", "Primero realiza al menos una apuesta.")
            return

        self.boton_girar.config(state="disabled")

        # Hilo para animar la ruleta
        threading.Thread(target=self.animar_y_resultado).start()

    def animar_y_resultado(self):
        for _ in range(20):  # rotar 20 veces
            self.ruleta_original = self.ruleta_original.rotate(18)  # rotar 18 grados
            self.ruleta_img = ImageTk.PhotoImage(self.ruleta_original)
            self.canvas.itemconfig(self.ruleta_canvas, image=self.ruleta_img)
            time.sleep(0.05)

        numero_ganador = random.randint(0, 36)
        self.root.after(0, lambda: self.mostrar_resultado(numero_ganador))

    def mostrar_resultado(self, numero_ganador):
        self.resultado.config(text=f"Número ganador: {numero_ganador}")

        if numero_ganador in self.apuestas:
            ganancia = self.apuestas[numero_ganador] * 35
            self.saldo += ganancia
            messagebox.showinfo("¡Ganaste!", f"Tu número {numero_ganador} ganó. Ganaste ${ganancia}!")
        else:
            messagebox.showinfo("Perdiste", f"Salió el {numero_ganador}. No ganaste esta vez.")

        self.apuestas.clear()
        for b in self.botones_numeros.values():
            b.config(bg="SystemButtonFace")

        self.label_saldo.config(text=f"Saldo: ${self.saldo}")
        self.boton_girar.config(state="normal")

        if self.saldo <= 0:
            messagebox.showwarning("Juego terminado", "Te has quedado sin dinero.")
            self.boton_girar.config(state="disabled")


# Ejecutar
if __name__ == "__main__":
    root = tk.Tk()
    app = RuletaCasino(root)
    root.mainloop()

