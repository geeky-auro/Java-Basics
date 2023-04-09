import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
    class SecondException extends Exception{
        String Secmessage;
        SecondException(String message){
            super(message);
            Secmessage=message;
        }
        @Override
        public String toString() {
            return "Wrong Input Parameters for Seconds field ";
        }
    }

    class MinuteExceptions extends Exception {
        String Secmessage;
        MinuteExceptions(String message){
            super(message);
            Secmessage=message;
        }
        @Override
        public String toString() {
            return "Wrong Input Parameters for Minute field ";
        }
    }

    class HourException extends Exception {
        String Secmessage;
        HourException(String message){
            super(message);
            Secmessage=message;
        }
        @Override
        public String toString() {
            return Secmessage;
        }
    }

    class Time {
        int hours,minutes,seconds;
        Time(int hours,int minutes,int seconds)throws HourException,MinuteExceptions,SecondException
        {
            if (hours > 24 || hours<0) {
                throw new HourException("Wrong Input Parameters for Hours field ");
            }else{
                this.hours=hours;
            }
            
            if(minutes>60 || minutes<0) {
                throw new MinuteExceptions("Wrong Input Parameters for Minutes field ");
            }else{
                this.minutes=minutes;
            }

            if(seconds>60 || seconds<0) {
                throw new SecondException("Wrong Input Parameters for Second field ");
            }else{
                this.seconds=seconds;
            }            
        } 
        void displayTime(){
            System.out.println("Time is "+hours+":"+minutes+":"+seconds);
        }   
    }

public class question2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of hours");
            int hours = scanner.nextInt();
            System.out.println("Enter the number of minutes");
            int minutes = scanner.nextInt();
            System.out.println("Enter the number of seconds");
            int seconds = scanner.nextInt();
            Time t=new Time(hours, minutes, seconds);    
            t.displayTime();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Local Time is "+LocalDate.now());
            System.out.println("Local TIme is "+LocalTime.now());
        }
    }
}
