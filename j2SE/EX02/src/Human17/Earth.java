package Human17;

public class Earth {
	public static final double EARTH_RADIOUS=6400;
	//지구 반지름
	public static final double EARTH_SURFACE_AREA;
	
	static { 
//		static final 변수의 초기화 가능
		//구의 표면적 = 4*반지름*반지름*3.14
		 EARTH_SURFACE_AREA = 4*3.14*EARTH_RADIOUS*EARTH_RADIOUS;
	}
}
