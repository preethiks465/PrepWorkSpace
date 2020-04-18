
enum Day{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SAT,SUN;
}

class test{
	Day day;
	public test(Day day) {
		this.day=day;
	}
	
	public void dayislike() {
		switch(day) {
		case MONDAY:
			System.out.println("monnnnnnn");
		}
	}
}