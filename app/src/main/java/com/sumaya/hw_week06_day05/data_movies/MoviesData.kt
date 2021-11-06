
data class MoviesData (
	val results : List<Results>,
)


data class Results (


	val poster_path : String,
	val release_date : String,
	val title : String,
	val vote_average : Double,

)
