import { Component } from "react";

class Timer extends Component {


    constructor(props) {
        super(props);
        console.log("INSIDE constructor");

        this.state = {
            seconds: 0,
            maxSeconds: 15
        }
    }

    componentDidMount() {
        console.log("INSIDE componentDidMount");

        this.intervalId = setInterval(
            () => {
                this.setState(
                    currState => ({
                        seconds: currState.seconds + 1
                    })
                );
            }, 1000);
    }

    shouldComponentUpdate(nextProps, nextState) {
        console.log("INSIDE shouldComponentUpdate", nextState);
        if (nextState.seconds < this.state.maxSeconds)
            return true;
        else
            return false;
    }


    componentWillUnmount() {
        console.log("INSIDE componentWillUnmount", nextState);
        clearInterval(this.intervalId);
    }

    render() {
        console.log("INSIDE render");
        // this.state.seconds = 100;
        //this.setState ( { seconds : 100 } );

        return (
            <div>
                <h1>Timer V2: {this.state.seconds} seconds</h1>
                <button onClick={() => this.setState({ seconds: 0 })}>Reset</button>
            </div>
        );
    }
}


export default Timer;
