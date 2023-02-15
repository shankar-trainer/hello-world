const { Component } = require("react");

class Logger extends Component {

    constructor(props) {
        super(props);
        this.state = {
            employee: [
                {
                    id: 1001,
                    name: 'surendra kumar',
                    salary: 24000
                },
                {
                    id: 1002,
                    name: 'amrendra kumar',
                    salary: 24000
                },
                {
                    id: 1003,
                    name: 'suman kumar',
                    salary: 24000
                },
                {
                    id: 1004,
                    name: 'akash kumar',
                    salary: 24000
                },
                {
                    id: 1005,
                    name: 'surendra kumar',
                    salary: 24000
                },
                {
                    id: 1006,
                    name: 'surendra kumar',
                    salary: 24000
                }
            ]
        };
    }
    render() {
        return (
            <div>
                <h1>hi</h1>
                {
                       this.state.employee.map(a=>
                      <div>  {a.id} {a.name}{a.salary}</div>
                    )
                }
            </div>)
    }
    
    componentWillMount() {
        console.log('componentWillMount is triggered');
      }
      componentDidMount(e) {
        console.log('componentDidMount is triggered');
   //     console.log('DOM node: ', ReactDOM.findDOMNode(this));
      }
      componentWillReceiveProps(newProps) {
        console.log('componentWillReceiveProps is triggered');
        console.log('new props: ', newProps);
      }
      shouldComponentUpdate(newProps, newState) {
        console.log('shouldComponentUpdate is triggered');
        console.log('new props: ', newProps);
        console.log('new state: ', newState);
        return true;
      }
      componentWillUpdate(newProps, newState) {
        console.log('componentWillUpdate is triggered');
        console.log('new props: ', newProps);
        console.log('new state: ', newState);
      }
      componentDidUpdate(oldProps, oldState) {
        console.log('componentDidUpdate is triggered');
        console.log('old props: ', oldProps);
        console.log('old props: ', oldState);
      }
      componentWillUnmount() {
        console.log('componentWillUnmount');
      }
    
}
export default Logger


