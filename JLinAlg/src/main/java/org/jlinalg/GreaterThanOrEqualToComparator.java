package org.jlinalg;

/**
 * class to return RingElement.one() or RingElement.zero(), depending on result
 * of RingElement greater than or equal to comparison
 * 
 * @author Simon Levy, Andreas Keilhauer, Georg THimm
 * @param <RE>
 *            the type of the objects to be compared.
 */
@SuppressWarnings("deprecation")
class GreaterThanOrEqualToComparator<RE extends IRingElement>
		extends FEComparator<RE>
{
	/**
	 * The singleton for this class.
	 */
	private static final FEComparator<IRingElement> INSTANCE = new GreaterThanOrEqualToComparator<IRingElement>();

	/**
	 * @return the singleton instance for this operator.
	 */
	public static FEComparator<IRingElement> getInstance()
	{
		return INSTANCE;
	}

	/**
	 * The constructor should only be called to create the singleton instance
	 * (see {@link #getInstance()}.
	 */
	@Deprecated
	public GreaterThanOrEqualToComparator()
	{
	}

	@Override
	public boolean compare(RE a, RE b)
	{
		return a.ge(b);
	}
}