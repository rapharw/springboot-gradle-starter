package com.example.demo.domain;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Employee {

    private Integer id;
    private String name;
    private LocalDateTime birthday;

    public Integer getAge(LocalDateTime now)
    {

        int age = now.getYear() - birthday.getYear();

        int nowMonth = now.getMonth().getValue();
        int nowDayMonth = now.getDayOfMonth();

        int birthdayMonth = birthday.getMonth().getValue();
        int birthdayDayMonth = birthday.getDayOfMonth();

        if ( (nowMonth <  birthdayMonth) || (nowMonth == birthdayMonth 	&& nowDayMonth < birthdayDayMonth)) {
            age--;
        }

        return age;
    }
}
