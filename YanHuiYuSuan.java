
public class YanHuiYuSuan {
	// 1.��֭+�մ� 2.��ˮ
	private Integer heDeType;
	// 1.��ͨ��2.������
	private Integer zhuangShiType;
	private Integer peopleCount;
	/***
	 * 
	 * @param heDeType 1.��֭+�մ� 2.��ˮ
	 * @param zhuangShiType 1.��ͨ��2.������
	 * @param peopleCount ����
	 */
	public YanHuiYuSuan(Integer heDeType, Integer zhuangShiType, Integer peopleCount) {
		this.heDeType = heDeType;
		this.zhuangShiType = zhuangShiType;
		this.peopleCount = peopleCount;
	}
	public void printMoney() {
		String str=peopleCount+"��";
		if(heDeType==1) {
		str=str+"��֭+�մ�";
		}
		if(heDeType==2) {
			str=str+"��ˮ";
		}
		if(zhuangShiType==1) {
			str=str+"��ͨ��";
		}
		if(zhuangShiType==2) {
			str=str+"������";
		}
		System.out.println(str+"��Ҫ"+getMoney());
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
