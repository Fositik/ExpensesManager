import java.util.ArrayList;
import java.util.HashMap;

public class ExpensesManager {
    HashMap<String, ArrayList<Double>> expensesByCategories;
    ArrayList<Double> expenses = new ArrayList<>();
    // Замените на таблицу с именем expensesByCategories

    ExpensesManager() {
        expensesByCategories = new HashMap<>();
        // Создайте таблицу
    }

    // Добавьте в метод ещё один параметр — category
    double saveExpense(double moneyBeforeSalary, double expense, String category) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);

        // Замените на работу с таблицей
        if (expensesByCategories.containsKey(category)) {  // Проверьте наличие категории
            expensesByCategories.get(category);// Получите список трат в этой категории
            expenses.add(expense);
            expensesByCategories.put(category, expenses);
            // Добавьте трату
        } else {
            ArrayList<Double> newExpenses = new ArrayList<>();
            newExpenses.add(expense);// Создайте новый список трат и добавьте в него сумму
            expensesByCategories.put(category, newExpenses); // Сохраните категорию и новый список трат в хеш-таблицу
        }

        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }


    void printAllExpensesByCategories() {
        // Замените логику для работы с таблицами

        for (String category : expensesByCategories.keySet()) {
            System.out.println(category);

            for (Double expense : expensesByCategories.get(category)) {
                System.out.println(expense);

            }
        }
    }

    // Метод должен принимать название категории и называться findMaxExpenseInCategory
    double findMaxExpenseInCategory(String category) {
        double maxExpense = 0;
        /* Замените логику для работы с таблицами
        Если категория есть, то ищем максмальную трату.
        Иначе печатаем "Такой категории пока нет." */
        if (expensesByCategories.containsKey(category)) {
            for (String categor : expensesByCategories.keySet()) {
                for (Double expense : expensesByCategories.get(category)) {
                    if (expense > maxExpense) {
                        maxExpense = expense;
                        category = categor;
                    }
                }
            }
        }
        return maxExpense;
    }

    void removeAllExpenses() {
        expensesByCategories.clear(); // Таблица называется иначе
        System.out.println("Траты удалены.");
    }
}

