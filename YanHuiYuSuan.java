
public class YanHuiYuSuan {
	// 1.果汁+苏打 2.酒水
	private Integer heDeType;
	// 1.普通型2.豪华型
	private Integer zhuangShiType;
	private Integer peopleCount;
	/***
	 * 
	 * @param heDeType 1.果汁+苏打 2.酒水
	 * @param zhuangShiType 1.普通型2.豪华型
	 * @param peopleCount 人数
	 */
	public YanHuiYuSuan(Integer heDeType, Integer zhuangShiType, Integer peopleCount) {
		this.heDeType = heDeType;
		this.zhuangShiType = zhuangShiType;
		this.peopleCount = peopleCount;
	}
	public void printMoney() {
		String str=peopleCount+"人";
		if(heDeType==1) {
		str=str+"果汁+苏打";
		}
		if(heDeType==2) {
			str=str+"酒水";
		}
		if(zhuangShiType==1) {
			str=str+"普通型";
		}
		if(zhuangShiType==2) {
			str=str+"豪华型";
		}
		System.out.println(str+"需要"+getMoney());
	}
	public Double getMoney() {
		Double total=0D;
		
		
		total=total+25*peopleCount;
		
		
		if(heDeType==1) {
			total=total+5*peopleCount*0.95;
		}
		if(heDeType==2) {
			total=total+25*peopleCount;
		}
		
		
		if(zhuangShiType==1) {
			total=total+30+7.5*peopleCount;
		}
		if(zhuangShiType==2) {
			total=total+50+15*peopleCount;
		}
		return total;
	}
}
