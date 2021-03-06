const FIND_ALL_ACCOUNTS = "http://localhost:8080/findAllAccounts"
const CREATE_ACCOUNT_URL = "http://localhost:8080/createAccount"
const DELETE_ACCOUNT_URL = "http://localhost:8080/deleteAccount"
const CHANGE_STATE = "http://localhost:8080/changeAccountState"

const findAllAccounts = () =>
    fetch(`${FIND_ALL_ACCOUNTS}`)
        .then(response => response.json())

const createAccount = () =>
    fetch(`${CREATE_ACCOUNT_URL}`)
        .then(response => response.json())

const deleteAccount = (id) =>
    fetch(`${DELETE_ACCOUNT_URL}/${number}`)

const changeAccountState = (account) =>
    fetch(`${CHANGE_STATE}/${account.number}/${account.state()}`)
        .then(response => response.json())