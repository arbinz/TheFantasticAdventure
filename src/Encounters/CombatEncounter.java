
public abstract class CombatEncounter extends EncounterClass
{
	protected String[] consequence = new String[1];
	protected String[] enemies = new String[1];
	
	public abstract void doCombat();
}
