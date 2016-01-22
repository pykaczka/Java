class Para<T,V>{
	private T t;
	private V v;
	Para(T t, V v){
		this.t=t;
		this.v=v;			
	}

	Para(Para<T,V> o){
		this.t=o.t;
		this.v=o.v;
	}

	void setT(T t){
		this.t=t;
	}
	void setV(V v){
		this.v=v;
	}
	T getT(){
		return this.t;
	}
	V getV(){
		return this.v;
	}
}
