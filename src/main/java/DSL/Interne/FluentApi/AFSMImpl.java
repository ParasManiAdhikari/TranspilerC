package DSL.Interne.FluentApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import DSL.Interne.objektmodell.State;
import DSL.Interne.objektmodell.Transition;

public class AFSMImpl implements AFSM
{

	private State initialState;

	private List<Transition> transitions = new ArrayList<>();
	HashMap<State, StateStatePair> afsm
			= new HashMap<>();

	public AFSMImpl()
	{
	}

	public AFSM addState(State id)
	{
		if (initialState == null) initialState = id;
		if (afsm.containsKey(id)) return this;
		afsm.put(id, new StateStatePair(id, null));
		return this;
	}

	public AFSM addTransition(Transition transition)
	{
//		if (afsm.get(transition.getSource()).target != null) return this;
		afsm.get(transition.getSource())
				.target = transition.getTarget();
		transitions.add(transition);
		return this;
	}

	public State getInitialState()
	{
		return initialState;
	}

	public StateStatePair makeTransition(State state)
	{
		if (!afsm.containsKey(state))
		{
			System.out.println("State not found");
			return null;
		}
		return afsm.get(state);
	}

	public List<State> getStates()
	{
		return new ArrayList<>(afsm.keySet());
	}

	public State getDestination(State s){
		return afsm.get(s).target;
	}

	public List<Transition> getTransitions(){
		return transitions;
	}

}
