	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
    static class qObj
    {
        Node node;
        int level;
        qObj(Node n,int l)
        {
            node=n;
            level=l;
        }
    }
	public static void topView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<qObj> q=new LinkedList<qObj>();
        q.add(new qObj(root,1));
        Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
       
        while(!q.isEmpty())
        {
            qObj popped=q.poll();
            if(!map.containsKey(popped.level))
            map.put(popped.level,popped.node.data);
            
            if(popped.node.left!=null)
            q.add(new qObj(popped.node.left,popped.level-1));
            
            if(popped.node.right!=null)
            q.add(new qObj(popped.node.right,popped.level+1));
        }
        
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
           System.out.print(e.getValue()+" ");
        }
      
    }
