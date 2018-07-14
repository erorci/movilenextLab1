package com.emerson.adapter;

import java.io.IOException;

import com.emerson.adapter.adapters.FileEmployeeRepository;
import com.emerson.adapter.service.BirthdayService;
import com.emerson.adapter.service.EmailService;
import com.emerson.adapter.service.adapter.DummyEmailService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
        System.out.println( "Running adapter application" );
        
        int day = 25;
        int month = 12;
        
        EmailService sender = new DummyEmailService();
        
        FileEmployeeRepository repository = new FileEmployeeRepository();
        repository.loadFromFile("employess.txt");
        
        BirthdayService service = new BirthdayService(repository, sender);
        service.sendGreetingsToEmployeeBornOn(day, month);
        
    }
}
