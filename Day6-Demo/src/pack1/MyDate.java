package pack1;

public class MyDate {

	 private int dd;
	 private int mm;
	 private int yyyy;
	 
	public MyDate(int dd, int mm, int yyyy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + dd;
//		result = prime * result + mm;
//		result = prime * result + yyyy;
//		return result;
//	}

	
	public boolean equals(MyDate d) {
		if((dd==d.dd)&&(mm==d.mm)&&(yyyy==d.yyyy)){
			return true;
			
		}
		else
			return false;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		MyDate other = (MyDate) obj;
//		if (dd != other.dd)
//			return false;
//		if (mm != other.mm)
//			return false;
//		if (yyyy != other.yyyy)
//			return false;
//		return true;
//	}
	
	
	 
	 
}
