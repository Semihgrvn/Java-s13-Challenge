package com.workintech.employeeApp.main;

import com.workintech.employeeApp.enums.Plan;
import com.workintech.employeeApp.model.Company;
import com.workintech.employeeApp.model.Employee;
import com.workintech.employeeApp.model.Healthplan;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 */
public class Main {

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData() {
        Healthplan plan1 = new Healthplan(1, "X sigorta", Plan.ADVANCE);
        Healthplan plan2 = new Healthplan(2, "Y sigorta", Plan.NORMAL);

        String[] healthPlans = new String[3];
        healthPlans[0] = plan1.getName();
        healthPlans[1] = plan2.getName();

String[] developerNames=new String[5];
        Employee developer = new Employee(1, "Ali", "ali@gmail.com", "1234", healthPlans);
        developer.addHealthplan(3,"X Sigorta");
        Company company= new Company(1,"Workintech", 5000000, developerNames);
        System.out.println(developer);
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.
     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args) {
        workWithData();
    }
}
