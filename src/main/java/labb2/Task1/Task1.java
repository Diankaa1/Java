package labb2.Task1;

// Демонстрация работы цепочки
public class Task1 {
    public static void main(String[] args) {
        // Создаем обработчиков
        Approver junior = new JuniorManager();
        Approver senior = new SeniorManager();
        Approver director = new Director();
        Approver glava = new Glava();

        // Устанавливаем цепочку: junior -> senior -> director
        junior.setNextApprover(senior);
        senior.setNextApprover(director);
        director.setNextApprover(glava);

        Trubble trubble1 = new Trubble("Первая проблема", 100);
        Trubble trubble2 = new Trubble("Вторая проблема", 10000);
        Trubble trubble3 = new Trubble("Третья проблема", 40000);
        Trubble trubble4 = new Trubble("Четвертая проблема", 100000);
        Trubble trubble5 = new Trubble("Пятая проблема", 100000000);

        // Запросы на одобрение разных сумм
        junior.processRequest(trubble1);
        junior.processRequest(trubble2);
        junior.processRequest(trubble3);
        junior.processRequest(trubble4);
        junior.processRequest(trubble5);
    }
}

