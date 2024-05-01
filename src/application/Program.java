package application;

import entities.Account;
import entities.AccountFactory;
import entities.User;
import entities.User.UserBuilder;

import static entities.AccountFactory.*;

public class Program {
    public static void main(String[] args) {
        Account account = AccountFactory("savings account");

        User user = new UserBuilder()
                .id(null)
                .firstName("Mateus")
                .lastName("Lopes").build();

        account.setHolder(user);
    }
}