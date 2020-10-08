package Linklist;

public class CLType {
   public data2 nodeData=new data2();
    public CLType nextNode;

   public CLType CLAddEnd(CLType head,data2 nodeData){
        CLType node,htemp;
        if((node=new CLType())==null){
            System.out.println("申请内存失败！");
            return null;
        }
        else {
            node.nodeData=nodeData;//数据域
            node.nextNode=null;//表尾
            if(head==null){
                head=node;
                return head;
            }
            htemp=head;
            while (htemp.nextNode!=null){//查找链尾
                htemp=htemp.nextNode;//htemp在不停移动
            }
            htemp.nextNode=node;//尾部插入结点
            return head;
        }
    }
   public CLType CLAddFirst(CLType head,data2 nodeData) {
       CLType node;
       if ((node = new CLType()) == null) {
           System.out.println("申请内存失败！");
           return null;
       } else {
           node.nodeData = nodeData;
           node.nextNode = head;//指向头引用指向的结点，代替之前第一个结点
           head = node;//头引用指向插入的新结点
           return head;
       }

    }
    public CLType CLFindNode(CLType head,String key){
       CLType htemp;
       htemp=head;
       while (htemp!=null){
           if(htemp.nodeData.key.compareTo(key)==0){
               return htemp;
           }
           htemp=htemp.nextNode;
       }
       return null;

    }
    public CLType CLInsertNode(CLType head,String findkey,data2 nodeData){
       CLType node,nodetemp;
        if ((node = new CLType()) == null) {
            System.out.println("申请内存失败！");
            return null;
        }
        node.nodeData=nodeData;
        nodetemp=CLFindNode(head,findkey);//得到要插入点位置
        if (nodetemp!=null){
            node.nextNode=nodetemp.nextNode;//新插入点指向目标点的下一结点
            nodetemp.nextNode=node;//目标位置点指向插入点
        }
        else {
            System.out.println("未找到正确位置！");

        }
        return head;
    }
    public int CLDeleteNode(CLType head,String key){
       CLType node,htemp;
       htemp=head;
       node=head;
       while (htemp!=null) {
           if (htemp.nodeData.key.compareTo(key) == 0) {
               node.nextNode = htemp.nextNode;//找到要删除的结点，使前一结点指向当前结点的下一结点，node代表前一个
               return 1;
           } else {
               node = htemp;//node代表前一个结点
               htemp = htemp.nextNode;
           }

       }
        return 0;
       }
        public int CLlength(CLType head){
            CLType htemp;
            int len=0;
            htemp=head;
            while (htemp!=null){
            len++;
            htemp=htemp.nextNode;
            }
            return len;
        }
        public void CLALLNode(CLType head){
            CLType htemp;
            data2 nodeData;
            htemp=head;
            System.out.printf("当前链表共有%d个结点,链表数据如下：\n",CLlength(head));
            while (htemp!=null){
                nodeData=htemp.nodeData;
                System.out.printf("结点(%s,%s,%d)",nodeData.key,nodeData.name,nodeData.age);
                htemp=htemp.nextNode;
            }
    }
}
