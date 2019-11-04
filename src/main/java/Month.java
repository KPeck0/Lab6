public final class Month {
    public static void main(String[] args){
        
    }
 
    private int monthNumber;
    public Month() {
        monthNumber = 1;
    }
    
    public Month(int num) {
        setMonthNumber(num);
    }
    
    public Month(String name) {
        switch (name) {
            case "February":
            monthNumber = 2;
            break;
        case "March":
            monthNumber = 3;
            break;
        case "April":
            monthNumber = 4;
            break;
        case "May":
            monthNumber = 5;
            break;
        case "June":
            monthNumber = 6;
            break;
        case "July":
            monthNumber = 7;
            break;
        case "August":
            monthNumber = 8;
            break;
        case "September":
            monthNumber = 9;
            break;
        case "October":
            monthNumber = 10;
            break;
        case "November":
            monthNumber = 11;
            break;
        case "December":
            monthNumber = 12;
            break;
        default:
            monthNumber = 1;
            break;
            
        }
    }
    
    public void setMonthNumber(int num) {
        if(num < 1 || num > 12)
            num = 1;
        monthNumber = num;
    }
    
    public int getMonthNumber() {
        return monthNumber;
        
    }
    
    public String getMonthName() {
        switch(monthNumber) {
            case 1:
            return "January";
                
            case 2:
            return "February";
            
            case 3:
            return "March";
            
            case 4:
            return "April";
            
            case 5:
            return "May";
            
            case 6:
            return "June";
            
            case 7:
            return "July";
            
            case 8:
            return "August";
            
            case 9:
            return "September";
            
            case 10:
            return "October";
            
            case 11:
            return "November"; 
            
            case 12:
            return "December";
            
        }
        return "";
    }
    
    
    @Override
    public String toString() {
        return getMonthName();
    }
    
    public boolean equals(Month m) {
        return monthNumber == m.monthNumber;
    }

    public boolean greaterThan(Month m) {
        return monthNumber > m.monthNumber;
    }

    public boolean lessThan(Month m) {
        return monthNumber < m.monthNumber;
    }

}