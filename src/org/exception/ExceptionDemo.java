package org.exception;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {

    private static void handleFile()  {
        File file = new File("nonexistent.txt");

        //read the file
        BufferedInputStream inputStream = null;

         try(BufferedInputStream bis = new BufferedInputStream(new java.io.FileInputStream(file))) {
            byte[] data = new byte[(int) file.length()];
            inputStream.read(data);
            System.out.println("File read successfully: " + new String(data));
        }
        catch (IOException|RuntimeException e) {
           throw new AccountNoNotValidException("Account number is not valid: " + e.getMessage());
        }
       catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
        catch (Error e) {
            System.err.println("A serious error occurred: " + e.getMessage());
        }
        finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.err.println("Failed to close the input stream: " + e.getMessage());
                }
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {

               handleFile();

               try{
                   int accountBalance =  1000;
                   accountBalance = accountBalance - 2000; // This will throw an exception
                   if(accountBalance < 0){
                     System.out.println("Account balance cannot be negative");
                   }

                } catch (AccountNoNotValidException e) {
                   System.out.println("Account balance cannot be negative");
                     System.err.println("Caught AccountNoNotValidException: " + e.getMessage());
               }


        //fail fast & fail safe


    }
}

class AccountNoNotValidException extends RuntimeException {
    public AccountNoNotValidException(String message) {
        super(message);
    }
}
