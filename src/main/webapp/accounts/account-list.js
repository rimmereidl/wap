class AccountList extends React.Component {
    state = {
        accounts: []
    }

    findAllAccounts = () =>
        findAllAccounts()
            .then(accounts => this.setState({accounts}))

    componentDidMount = () =>
        this.findAllAccounts()
    createAccount = () =>
        createAccount()
            .then(this.findAllAccounts)
    deleteAccount = (number) =>
        deleteAccount(number)
            .then(this.findAllAccounts)
    render() {
        return(
            <div>
                <h1>Account List</h1>
                <table>
                    {
                        this.state.accounts.map(account =>
                            <tr key={account.id}>

                                <td>
                                    <button
                                        onClick={() => this.deleteAccount(account.id)}>
                                        Delete
                                    </button>
                                </td>

                            </tr>
                        )
                    }
                </table>
                <button onClick={this.createCourse}>
                    Create
                </button>
            </div>
        )
    }
}

ReactDOM.render(
    <AccountList/>, document.getElementById("root"))