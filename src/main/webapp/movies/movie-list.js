class MovieList extends React.Component {
  state = {
    movies: []
  }
  findAllMovies = () =>
    findAllMovies()
      .then(movies => this.setState({movies}))

  componentDidMount = () =>
    this.findAllMovies()

  createMovie = () =>
    createCourse()
      .then(this.findAllMovies)

  render() {
    return(
      <div className="container">
        <h1>Course List</h1>
        <table>
        {
          this.state.movies.map(movie =>
            <tr key={movie.id}>
              <td>
                {movie.title}
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
  <MovieList/>, document.getElementById("root"))
