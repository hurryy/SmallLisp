package jus.aoo.lisp.core;

public interface SExpr {

	public SExpr car();
	public SExpr cdr();
	public boolean eq(SExpr expr);
	public boolean isAtome();
	public boolean isList();
	public boolean isNil();
	public boolean isSCons();
	public boolean isSymbole();
	public String toString();
}
