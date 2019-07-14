package leetcode307;

import leetcode303.Merger;

/**
 * @author Taochunwei
 * @date 2019/7/12 - 20:27
 */
public class NumArray {
    private class SegmentTrre <E>{
        private E[] data;
        private E[] tree;
        private Merger<E> merg;
        public SegmentTrre(E[] arr,Merger<E> merger){
            this.merg=merger;
            data=(E[])new Object[arr.length];
            for (int i = 0; i <arr.length ; i++) {
                data[i]=arr[i];
            }
            tree=(E[])new Object[4*arr.length];
            buildSegmentTrre(0,0,data.length-1);
        }
        private void buildSegmentTrre(int treeIndex,int l,int r){
            if(l==r){
                tree [treeIndex]=data[l];
                return;
            }
            int leftChildIndex=leftChild(treeIndex);
            int rightChildIndex=rightChild(treeIndex);
            int mid=l+(r-l)/2;
            buildSegmentTrre(leftChildIndex,l,mid);
            buildSegmentTrre(rightChildIndex,mid+1,r);
            tree[treeIndex]=merg.merge(tree[leftChildIndex],tree[rightChildIndex]);

        }
        public int getSize(){
            return data.length;
        }
        public E get(int index){
            if(index<0||index>=data.length)
                throw new IllegalArgumentException("index is illegal.");
            return data[index];
        }
        private int leftChild(int index){
            return 2*index+1;
        }
        private int rightChild(int index){ return 2*index+2; }
        //返回 [queryl,queryr]之间的值
        public E query(int queryL,int queryR){
            if(queryL<0||queryL>=data.length||queryR<0||queryR>=data.length||queryL>queryR)
                throw new IllegalArgumentException("The index is illegal");
            return query(0,0,data.length-1,queryL,queryR);
        }
        //在treeIndex为根表示[l...r]的范围里，搜索区间[queryl...queryR]的值
        private E query(int treeIndex,int l,int r,int queryL,int queryR){
            if(l==queryL&&r==queryR)
                return tree[treeIndex];

            int mid=l+(r-l)/2;
            if(queryR<=mid)
                return query(leftChild(treeIndex),l,mid,queryL,queryR);
            if(queryL>=mid+1)
                return query(rightChild(treeIndex),mid+1,r,queryL,queryR);
            else
                return merg.merge(query(leftChild(treeIndex),l,mid,queryL,mid),query(rightChild(treeIndex),mid+1,r,mid+1,queryR));
        }

        public void Set(int index,E e){
            if(index<0||index>=data.length)
                throw new IllegalArgumentException("Error");

            data[index]=e;
            set(0,0,data.length-1,index,e );
        }
        private void set(int treeIndex,int l,int r,int index,E e){
            if(l==r){
                tree[treeIndex]=e;
                return;
            }
            int mid=l+(r-l)/2;
            int leftChildIndex=leftChild(treeIndex);
            int rightChildIndex=rightChild(treeIndex);
            if(index<=mid)
                set(leftChildIndex,l,mid,index,e);
            if(index>=mid+1)
                set(rightChildIndex,mid+1,r,index,e);

            tree[treeIndex]=merg.merge(tree[leftChildIndex],tree[rightChildIndex]);

        }
        @Override
        public String toString(){
            StringBuilder res=new StringBuilder();
            res.append('[');
            for (int i = 0; i <tree.length ; i++) {
                if(tree[i]!=null)
                    res.append(tree[i]);
                else res.append("null");
                if(i!=tree.length-1){
                    res.append(',');
                }else res.append(']');

            }
            return res.toString();
        }
    }
    public interface Merger<E> {
        E merge(E a, E b);
    }
    private SegmentTrre<Integer> segmentTrre;
    public NumArray(int[] nums) {
        if(nums.length!=0){
            Integer data[]=new Integer[nums.length];
            for (int i = 0; i <nums.length ; i++) {
                data[i]=nums[i];
            }
            segmentTrre=new SegmentTrre<>(data,(a,b)-> a+b);
        }
    }

    public void update(int i, int val) {
        if(segmentTrre==null)
            throw new IllegalArgumentException("Error");
        segmentTrre.Set(i,val);
    }

    public int sumRange(int i, int j) {
        if(segmentTrre==null)
            throw new IllegalArgumentException("null");
        return  segmentTrre.query(i,j);
    }


}
