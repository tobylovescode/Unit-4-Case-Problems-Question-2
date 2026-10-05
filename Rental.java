public class Rental 
{
    public final static int MINUTES_IN_HOUR = 60;
    public final static int HOURLY_RATE = 40;
    private String contractNumber;
    private int hours;
    private int extraMinutes;
    private int price;
 
    public Rental() 
    {
        this("A000", 0);
    }
    public Rental(String contractNumber, int minutes) 
    {
        setContractNumber(contractNumber);
        setHoursAndMinutes(minutes);
    }
 
    public void setContractNumber(String contractNumber) 
    {
        this.contractNumber = contractNumber;
    }

    public void setHoursAndMinutes(int minutes) 
    {
        hours = minutes / MINUTES_IN_HOUR;
        extraMinutes = minutes % MINUTES_IN_HOUR;
        price = hours * HOURLY_RATE + extraMinutes;
    }
 
    public String getContractNumber() 
    {
        return contractNumber;
    }
 
    public int getHours() 
    {
        return hours;
    }
 
    public int getExtraMinutes() 
    {
        return extraMinutes;
    }
 
    public int getPrice() 
    {
        return price;
    }
}
 