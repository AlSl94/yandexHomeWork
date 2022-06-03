package ru.yandex.Sprint.Sprint2.Lesson11_3;

import java.util.Objects;

public class Actor {
    String firstName;
    String lastName;

    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Actor diffActor = (Actor) obj;
        return Objects.equals(firstName, diffActor.firstName)
                && Objects.equals(lastName, diffActor.lastName);
        }
        @Override
    public int hashCode() {
        int hash = 22;
        if (firstName != null) {
            hash = hash + firstName.hashCode();
        }
        hash = hash * 35;

        if (lastName != null) {
            hash = hash + lastName.hashCode();
        }
        return hash;
        }
    }
