package com.jaswine.linear;


import java.util.Random;

/**
 * 数组数据结构的实现
 *
 * @author Jaswine
 */
public class Jarray{


	/** 数组 */
	private int[] data;
	/** 数组长度 */
	private int length;
	/** 游标 */
	private int count;
	/** 初始大小 */
	private static final int INITCAPACITY = 10;
	/** 扩容大小 */
	private static final int EXPANDCAPACITY = 10;

	Jarray(int n){
		this.data = new int[n];
		this.length = n;
		this.count = 0;
	}

	Jarray(){
		this.data = new int[INITCAPACITY];
		this.length = INITCAPACITY;
		this.count = 0;
	}

	/**
	 * 插入(最后一个)
	 * @param v 值
	 */
	void insert(int v){

		// 是否越界
		if (count == length - 1){
			// 扩容
			expand(this.data);
		}
		this.data[count] = v;
		count++;
	}

	/**
	 * 插入(指定位置)
	 * @param k 索引
	 * @param v 值
	 */
	void insert(int k,int v){

		// 是否越界
		if (k > length - 1){
			throw new ArrayIndexOutOfBoundsException("OUT OF BOUNDS");
		}

		// 插入后是否扩容
		if (count == length){
			expand(this.data);
		}
		// todo 数组移动
		this.data[k] = v;

	}

	/**
	 * 删除
	 * @param n 索引
	 */
	void delete(int n){
		if (n > length - 1){
			throw new ArrayIndexOutOfBoundsException("OUT OF BOUNDS");
		}
		this.data[n] = 0;
	}

	/**
	 * 更新
	 * @param k 索引
	 * @param v 值
	 */
	void update(int k,int v){
		if (k > length -1){
			throw new ArrayIndexOutOfBoundsException("OUT OF BOUNDS");
		}
		this.data[k] = v;
	}


	/**
	 * 查找
	 * @param n 索引
	 * @return 数组中索引对应的值
	 */
	int find(int n){
		if ( n > length - 1){
			throw new ArrayIndexOutOfBoundsException("OUT OF BOUNDS");
		}
		return data[n];
	}


	/*====utils======*/

	/**
	 * 扩展数组
	 */
	private void expand(int[] originalArray){
		int[] newArray = new int[this.data.length + EXPANDCAPACITY];
		for (int i = 0; i < originalArray.length; i++){
			newArray[i] = originalArray[i];
		}
		this.data = newArray;
	}

	public static void main(String[] args) {
		Jarray jarray = new Jarray(2);
//		Random random = new Random();
//		jarray.insert(1,13);
//		jarray.insert(random.nextInt());
//		jarray.insert(random.nextInt());
//		jarray.insert(random.nextInt());
//		jarray.insert(random.nextInt());
//		jarray.insert(random.nextInt());
//		jarray.insert(random.nextInt());
//		jarray.insert(random.nextInt());
//		jarray.insert(random.nextInt());

		for (int i : jarray.data){
			System.out.println(i);
		}
	}

}
