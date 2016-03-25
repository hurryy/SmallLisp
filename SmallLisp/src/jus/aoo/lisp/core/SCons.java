package jus.aoo.lisp.core;

public class SCons implements List{

	private SExpr car;
	// next = List car -> SCons || NIL
	private SExpr cdr;
	
	/**
	 * 
	 * @param expr
	 * @param next
	 */
	public SCons(SExpr car, SExpr cdr)
	{
		this.car = car;
		this.cdr = cdr;
	}

	@Override
	public SExpr car() { return this.car; }

	@Override
	public SExpr cdr() { return this.cdr; }

	@Override
	public boolean eq(SExpr expr) {
		if(this == expr) return true;
		return false;
	}

	@Override
	public boolean isAtome() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isList() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isNil() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSCons() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSymbole() {
		// TODO Auto-generated method stub
		return false;
	};
}
