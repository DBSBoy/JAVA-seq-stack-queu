package Stack.Stacklist;

public class StackType {
    static final int MAXLEN=50;
    data3[] data=new data3[MAXLEN+1];//结点
    int top;//栈顶

    public StackType STInit(){
        StackType p;
        if ((p=new StackType())!=null){
            p.top=0;
            return p;
        }
        return null;
    }
    public boolean STIsEmpty(StackType s){
        boolean t;
        t=(s.top==0);
        return t;
    }
    public boolean STIsFull(StackType s){
        boolean t;
        t=(s.top==MAXLEN);
        return t;
    }
    public void STCleat(StackType s){
        s.top=0;
    }
    public void STFree(StackType s){
        if(s!=null){
            s=null;
        }
    }
    public int Push(StackType s,data3 data3){
        if(s.top+1>MAXLEN){
            System.out.println("栈满溢出");
            return 0;
        }
        s.data[++s.top]=data3;//先移动再赋值
        return 1;
    }
    public data3 Pop(StackType s){
        if(s.top==0){
            System.out.println("栈空");
            System.exit(0);
        }
        return (s.data[s.top--]);
    }
    public data3 ReadST(StackType s){
        if(s.top==0){
            System.out.println("空栈");
            System.exit(0);
        }
        return (s.data[s.top]);
    }
}
