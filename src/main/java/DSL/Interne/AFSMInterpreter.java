package DSL.Interne;

import DSL.Interne.FluentApi.AFSMImpl;
import DSL.Interne.FluentApi.StateStatePair;
import DSL.Interne.objektmodell.State;

import java.util.ArrayList;

public class AFSMInterpreter
{

	public State state;

	public void run(AFSMImpl afsm, String initialStateId)
	{
		ArrayList<String> output = new ArrayList<>();
		state = afsm.getStates().stream()
				.filter(x -> x.getStateID().equals(initialStateId))
				.findFirst()
				.orElse(null);
		int length = afsm.getStates().size();
		while(!state.isAccepted())
		{
			StateStatePair pair = afsm.makeTransition(state);
			if (pair != null)
			{
				output.add(pair.target.getStateID());
				state = pair.target;
			}
			if(output.size() > length)
			{
				System.out.println("Endlosschleife");
				break;
			}
		}
	}

}
