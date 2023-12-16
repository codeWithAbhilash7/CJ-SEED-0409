package com.innerclasses;

public class Outer {

	private int outerVariable;
	public static final Inner inner = new Inner(10);

	public Outer(int outerVariable) {
		super();
		this.outerVariable = outerVariable;
	}

	public int getOuterVariable() {
		return outerVariable;
	}

	public void setOuterVariable(int outerVariable) {
		this.outerVariable = outerVariable;
	}

	public Inner getInnerObject(int no1) {
		class LocalInner {
			private int inner;

			LocalInner(int no1) {
				this.inner = no1;
			}
		}

		return null;

	}

	static class Inner {
		private int innerVariable;

		public Inner(int innerVariable) {
			super();
			this.innerVariable = innerVariable;
			System.out.println("Outer variable ");
		}

		public int getInnerVariable() {
			return innerVariable;
		}

		public void setInnerVariable(int innerVariable) {
			this.innerVariable = innerVariable;
		}

		public static void display() {
			System.out.println("This is a static method");
		}

		@Override
		public String toString() {
			return "Inner [innerVariable=" + innerVariable + "]";
		}

	}

}
