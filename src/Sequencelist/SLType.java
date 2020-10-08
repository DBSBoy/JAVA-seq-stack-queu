package Sequencelist;

public class SLType {
	static final int MAXLEN = 10;
	public data[] ListData = new data[MAXLEN + 1];//保存顺序表各个结点的数组
	int ListLen;//顺序表已有结点长度

	public void SLInit(SLType sl) {

		sl.ListLen = 0;//初始化顺序表
	}

	public int SLLength(SLType sl) {

		return sl.ListLen;
	}

	public int SLInsert(SLType sl, int n, data d) {
		int i;
		if (sl.ListLen > MAXLEN) {
			System.out.println("sequence is full");
			return 0;
		}
		if (n < 1 || n > sl.ListLen + 1) {
			System.out.println("Wrong number");
			return 0;//插入的序号不对
		}
		for (i = sl.ListLen; i >= n; i--) {
			sl.ListData[i + 1] = sl.ListData[i];
		}
		sl.ListData[n] = d;//插入结点
		sl.ListLen++;
		return 1;
	}

	public int SLALL(SLType sl) {
		int i;
		for (i = 1; i <= sl.ListLen; i++) {
			System.out.printf("data"+"["+i+"]"+":(%s,%d,%s)\n", sl.ListData[i].key, sl.ListData[i].age, sl.ListData[i].name);
		}
		return 0;
	}


	public int SLadd(SLType sl,data d) {
		if(sl.ListLen>=MAXLEN) {
			System.out.println("sequence is full");
			return 0;
		}
		sl.ListData[++sl.ListLen]=d;
		return 1;
	}
	public int SLdelete(SLType sl,int n) {
		int i;
		if(n<1||n>sl.ListLen) {
			System.out.println("wrong number");
			return 0;
		}
		for(i=n;i<sl.ListLen;i++) {
			sl.ListData[i]=sl.ListData[i+1];//直接覆盖
		}
		sl.ListLen--;
		return 1;
	}
//	按照序号查找结点
	public data slfindbynum(SLType sl,int n) {
		if(n<1||n>sl.ListLen) {
			System.out.println("wrong number");
			return null;
		}
		return sl.ListData[n];
	}
//	按照关键字
	public int slfindbycont(SLType sl,String key) {
		int i;
		for(i=1;i<=sl.ListLen;i++) {
			if(sl.ListData[i].key.compareTo(key)==0) {
				return i;
			}
		}
		return 0;
	}
	
	
}
