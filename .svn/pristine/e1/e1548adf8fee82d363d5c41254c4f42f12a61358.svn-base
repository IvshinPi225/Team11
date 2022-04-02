
import org.junit.BeforeClass;


import org.junit.Test;

import static org.junit.Assert.assertFalse;

import org.junit.AfterClass;

public class Class3Test {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

        //Создание массива и его сортировка перед выполнением теста
        Lb5.Class2.array();
        Lb5.Class3.sort(Lb5.Class2.mas);
    }


    @AfterClass
    public static void tearDownAfterClass() throws Exception {

        //Очистка массива после выполнения теста
        for (int i = 0; i <Lb5.Class2.mas.length; i++) {

        	Lb5.Class2.mas[i] = 0;

        }

    }

    @Test
    public void testSort() {

        for (int i = 1; i < Lb5.Class2.mas.length; i++) {

            //Все пары чисел проверяются на условие пузырьковой сортировки
            assertFalse(Lb5.Class2.mas[i - 1] > Lb5.Class2.mas[i]);

        }
        //fail("Not yet implemented");
    }
}
