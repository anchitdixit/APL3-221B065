/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class LE0
{
    int Speed;
    String Name;
    void setSpeed(int Speed){
        this.Speed=Speed;
    }
    void setName(String Name){
        this.Name=Name;
    }
    int getSpeed(){
        return this.Speed;
    }
    String getName(){
        return this.Name;
    }
	public static void main(String[] args) {
		Main c1 = new Main();
		
		c1.setName("Thar");
		c1.setSpeed(100);
		System.out.println(c1.getName());
		System.out.println(c1.getSpeed());
	}
}