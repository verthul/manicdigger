// Generated automatically with "cito". Do not edit.
package manicdigger.lib;

public class Expires
{

	static Expires create(float p)
	{
		Expires expires = new Expires();
		expires.totalTime = p;
		expires.timeLeft = p;
		return expires;
	}
	float timeLeft;
	float totalTime;
}
