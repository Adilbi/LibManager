import java.util.Scanner;
import java.util.ArrayList;

public class ExpensesManager {
    ArrayList <Double> expenses = new ArrayList<>();
ExpensesManager () {
    expenses = new ArrayList<>();
}
    double saveExpense(double moneyBeforeSalary, double expense) {
        expenses.add(expense);
        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в тенге: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 5000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpenses() {
        for (int i = 0; i < expenses.size(); i++) {
            System.out.println("День " + (i + 1) + ". Потрачено " + expenses.get(i) + " тенге");
        }
    }

    double findMaxExpense() {
        double maxExpense = 0;
        for (double exp : expenses) {
            if (exp > maxExpense) {
                maxExpense = exp;
            }
        }
        return maxExpense;
    }

    public void removeAllExpenses () {
    expenses.clear();
        System.out.println("Список трат пуст!");
    }
    public void removeExpense(double expense) {
    boolean exp = expenses.contains(expense);
    if ( exp == false) {
        System.out.println("Такой траты нет в списке!");
    } else {
        expenses.remove(expense);
        System.out.println("Трата удалена!");
    }
    }
}
