class Solution {
    public int romanToInt(String str) {
       HashMap<Character,Integer> map = new HashMap<>();
       map.put('I',1);
       map.put('V',5);
       map.put('X',10);
       map.put('L',50);
       map.put('C',100);
       map.put('D',500);
       map.put('M',1000);

       int result = 0;

       for(int i=0;i<str.length();i++){
        int current = map.get(str.charAt(i));

        if(i+1 < str.length() && current < map.get(str.charAt(i+1))){
            result = result - current;
        }
        else{
            result = result + current;
        }
       }
       return result;
    }
}