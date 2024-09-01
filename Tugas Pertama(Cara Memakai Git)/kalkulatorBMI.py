import tkinter as tk
from tkinter import messagebox

class BMI_Calculator:
    def __init__(self, master):
        self.master = master
        self.master.title("BMI Calculator")

        self.height_label = tk.Label(self.master, text="Height (cm):")
        self.height_label.grid(row=0, column=0)
        self.height_entry = tk.Entry(self.master)
        self.height_entry.grid(row=0, column=1)

        self.weight_label = tk.Label(self.master, text="Weight (kg):")
        self.weight_label.grid(row=1, column=0)
        self.weight_entry = tk.Entry(self.master)
        self.weight_entry.grid(row=1, column=1)

        self.calculate_button = tk.Button(self.master, text="Calculate", command=self.calculate_bmi)
        self.calculate_button.grid(row=2, column=0, columnspan=2)

        self.result_label = tk.Label(self.master, text="")
        self.result_label.grid(row=3, column=0, columnspan=2)

    def calculate_bmi(self):
        try:
            height = float(self.height_entry.get()) / 100
            weight = float(self.weight_entry.get())
            bmi = weight / (height * height)
            bmi_category = self.determine_bmi_category(bmi)
            ideal_weight = self.calculate_ideal_weight(height)
            result_text = f"BMI: {bmi:.2f}\nCategory: {bmi_category}\nIdeal Weight: {ideal_weight:.2f} kg"
            self.result_label.config(text=result_text)
        except ValueError:
            messagebox.showerror("Error", "Invalid input. Please enter numeric values.")

    def determine_bmi_category(self, bmi):
        if bmi < 18.5:
            return "Underweight"
        elif 18.5 <= bmi < 25:
            return "Normal"
        else:
            return "Overweight"

    def calculate_ideal_weight(self, height):
        ideal_weight = 22 * height * height
        return ideal_weight

if __name__ == "__main__":
    root = tk.Tk()
    my_gui = BMI_Calculator(root)
    root.mainloop()