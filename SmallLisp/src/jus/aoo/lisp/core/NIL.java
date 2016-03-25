package jus.aoo.lisp.core;

public class NIL extends Atome implements List{

	private static NIL nil = null;
	
	private NIL() {}

	public NIL getInstance()
	{
		if(nil == null)
			nil = new NIL();
		return nil;
	}
	@Override
	public SExpr car() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SExpr cdr() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eq(SExpr expr) {
		// TODO Auto-generated method stub
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
	}
}
