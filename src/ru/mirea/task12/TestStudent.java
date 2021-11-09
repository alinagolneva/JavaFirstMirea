package ru.mirea.task12;

public class TestStudent {


    private static Student value;

    public static void main(String[] args) {
        Student[] iDNumber = new Student[4];
        iDNumber[0] = new Student(687490300, 2.3);
        iDNumber[1] = new Student(345098578, 4.6);
        iDNumber[2] = new Student(545098578, 3.5);
        iDNumber[3] = new Student(845098578, 8.1);
        for (int left = 0; left < iDNumber.length; left++) {
            // Вытаскиваем значение элемента
            value = iDNumber[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if(value.id<iDNumber[i].id)
                {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                } else {
                    iDNumber[i + 1] = iDNumber[i];
                }
            }
            // В освободившееся место вставляем вытащенное значение
            iDNumber[i + 1] = value;
        }

        for(int i = 0; i < iDNumber.length; i++)
        {
            System.out.println(iDNumber[i].id);
        }

    }
}

