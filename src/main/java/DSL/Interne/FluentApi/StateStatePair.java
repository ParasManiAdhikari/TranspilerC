package DSL.Interne.FluentApi;


import DSL.Interne.objektmodell.State;

public class StateStatePair
{

    public State source;
    public State target;
    public StateStatePair(State action, State target){
        this.source = action;
        this.target = target;
    }

}
