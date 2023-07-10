package week_14.exceptions.custom_exception;

public class Library {
    public void getLibraryCard(String city){
        if (city.equals("Fairfax") || city.equals("McLean")){
            System.out.println("Library Card Created");
        }else {
            throw new NonResidentException("You can not get the card other than Fairfax or McLean cities");
        }
    }

    public void borrow(boolean checkout) throws FailToCheckOutException{
        if (checkout){
            System.out.println("Enjoy Reading");
        }else {
            throw new FailToCheckOutException("You ca not check it out");
        }
    }
}
