class Solution { 
    public boolean lemonadeChange(int[] bills) { 
        int five = 0; 
        int ten = 0; 

        for(int i = 0; i < bills.length; i++){ 
            if(bills[i] == 5){ 
                five++; 
            } 
            else if(bills[i] == 10){ 
                if(five == 0) return false; // Cannot make change
                five--; 
                ten++; 
            } 
            else { // bills[i] == 20
                if(ten > 0 && five > 0){ // Prefer giving one $10 and one $5
                    ten--; 
                    five--; 
                } 
                else if(five >= 3){ // Fallback to three $5 bills
                    five -= 3; 
                } 
                else { 
                    return false; // Cannot make change
                } 
            } 
        } 
        return true; 
    } 
}
