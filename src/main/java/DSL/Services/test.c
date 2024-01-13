enum State { State1, State2, State3 };
enum State initial = State1;
enum Event { Event1, Event2, Event3 };
void Action1() { }
void Action2() { }
void Action3() { }
enum State next(enum State s, enum Event e) {
    switch(s) {
        case :
            switch(e) {
                default: return UNDEFINED;
            }
        case :
            switch(e) {
                default: return UNDEFINED;
            }
        default: return UNDEFINED;
    }
}