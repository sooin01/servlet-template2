<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Table with fixed header and sidebar</title>

<style type="text/css">
.fixedTable .table {
	background-color: white;
	width: auto;
}

.fixedTable .table tr td, .fixedTable .table tr th {
	min-width: 100px;
	width: 100px;
	min-height: 20px;
	height: 20px;
	padding: 5px;
}

.fixedTable-header {
	width: 510px;
	height: 30px;
	margin-left: 110px;
	overflow: hidden;
	border-bottom: 1px solid #CCC;
}

.fixedTable-sidebar {
	width: 110px;
	height: 310px;
	float: left;
	overflow: hidden;
	border-right: 1px solid #CCC;
}

.fixedTable-body {
	overflow: auto;
	width: 510px;
	height: 310px;
	float: left;
}
</style>
</head>

<body>

	<div class="fixedTable" id="demo">
		<header class="fixedTable-header">
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>A</th>
						<th>B</th>
						<th>C</th>
						<th>D</th>
						<th>E</th>
						<th>F</th>
						<th>G</th>
						<th>H</th>
						<th>I</th>
						<th>J</th>
						<th>K</th>
						<th>L</th>
					</tr>
				</thead>
			</table>
		</header>
		<aside class="fixedTable-sidebar">
			<table class="table table-bordered">
				<tbody>
					<tr>
						<td>14567567465447567467</td>
					</tr>
					<tr>
						<td>2</td>
					</tr>
					<tr>
						<td>3</td>
					</tr>
					<tr>
						<td>4</td>
					</tr>
					<tr>
						<td>5</td>
					</tr>
					<tr>
						<td>6</td>
					</tr>
					<tr>
						<td>7</td>
					</tr>
					<tr>
						<td>8</td>
					</tr>
					<tr>
						<td>9</td>
					</tr>
					<tr>
						<td>10</td>
					</tr>
					<tr>
						<td>11</td>
					</tr>
					<tr>
						<td>12</td>
					</tr>
					<tr>
						<td>13</td>
					</tr>
					<tr>
						<td>14</td>
					</tr>
					<tr>
						<td>15</td>
					</tr>
					<tr>
						<td>16</td>
					</tr>
					<tr>
						<td>17</td>
					</tr>
					<tr>
						<td>18</td>
					</tr>
					<tr>
						<td>19</td>
					</tr>
				</tbody>
			</table>
		</aside>
		<div class="fixedTable-body">
			<table class="table table-bordered">
				<tbody>
					<tr>
						<td>a</td>
						<td>b</td>
						<td>c</td>
						<td>d</td>
						<td>e</td>
						<td>f</td>
						<td>g</td>
						<td>h</td>
						<td>i</td>
						<td>j</td>
						<td>k</td>
						<td>l</td>
					</tr>
					<tr>
						<td>a</td>
						<td>b</td>
						<td>c</td>
						<td>d</td>
						<td>e</td>
						<td>f</td>
						<td>g</td>
						<td>h</td>
						<td>i</td>
						<td>j</td>
						<td>k</td>
						<td>l</td>
					</tr>
					<tr>
						<td>a</td>
						<td>b</td>
						<td>c</td>
						<td>d</td>
						<td>e</td>
						<td>f</td>
						<td>g</td>
						<td>h</td>
						<td>i</td>
						<td>j</td>
						<td>k</td>
						<td>l</td>
					</tr>
					<tr>
						<td>a</td>
						<td>b</td>
						<td>c</td>
						<td>d</td>
						<td>e</td>
						<td>f</td>
						<td>g</td>
						<td>h</td>
						<td>i</td>
						<td>j</td>
						<td>k</td>
						<td>l</td>
					</tr>
					<tr>
						<td>a</td>
						<td>b</td>
						<td>c</td>
						<td>d</td>
						<td>e</td>
						<td>f</td>
						<td>g</td>
						<td>h</td>
						<td>i</td>
						<td>j</td>
						<td>k</td>
						<td>l</td>
					</tr>
					<tr>
						<td>a</td>
						<td>b</td>
						<td>c</td>
						<td>d</td>
						<td>e</td>
						<td>f</td>
						<td>g</td>
						<td>h</td>
						<td>i</td>
						<td>j</td>
						<td>k</td>
						<td>l</td>
					</tr>
					<tr>
						<td>a</td>
						<td>b</td>
						<td>c</td>
						<td>d</td>
						<td>e</td>
						<td>f</td>
						<td>g</td>
						<td>h</td>
						<td>i</td>
						<td>j</td>
						<td>k</td>
						<td>l</td>
					</tr>
					<tr>
						<td>a</td>
						<td>b</td>
						<td>c</td>
						<td>d</td>
						<td>e</td>
						<td>f</td>
						<td>g</td>
						<td>h</td>
						<td>i</td>
						<td>j</td>
						<td>k</td>
						<td>l</td>
					</tr>
					<tr>
						<td>a</td>
						<td>b</td>
						<td>c</td>
						<td>d</td>
						<td>e</td>
						<td>f</td>
						<td>g</td>
						<td>h</td>
						<td>i</td>
						<td>j</td>
						<td>k</td>
						<td>l</td>
					</tr>
					<tr>
						<td>a</td>
						<td>b</td>
						<td>c</td>
						<td>d</td>
						<td>e</td>
						<td>f</td>
						<td>g</td>
						<td>h</td>
						<td>i</td>
						<td>j</td>
						<td>k</td>
						<td>l</td>
					</tr>
					<tr>
						<td>a</td>
						<td>b</td>
						<td>c</td>
						<td>d</td>
						<td>e</td>
						<td>f</td>
						<td>g</td>
						<td>h</td>
						<td>i</td>
						<td>j</td>
						<td>k</td>
						<td>l</td>
					</tr>
					<tr>
						<td>a</td>
						<td>b</td>
						<td>c</td>
						<td>d</td>
						<td>e</td>
						<td>f</td>
						<td>g</td>
						<td>h</td>
						<td>i</td>
						<td>j</td>
						<td>k</td>
						<td>l</td>
					</tr>
					<tr>
						<td>a</td>
						<td>b</td>
						<td>c</td>
						<td>d</td>
						<td>e</td>
						<td>f</td>
						<td>g</td>
						<td>h</td>
						<td>i</td>
						<td>j</td>
						<td>k</td>
						<td>l</td>
					</tr>
					<tr>
						<td>a</td>
						<td>b</td>
						<td>c</td>
						<td>d</td>
						<td>e</td>
						<td>f</td>
						<td>g</td>
						<td>h</td>
						<td>i</td>
						<td>j</td>
						<td>k</td>
						<td>l</td>
					</tr>
					<tr>
						<td>a</td>
						<td>b</td>
						<td>c</td>
						<td>d</td>
						<td>e</td>
						<td>f</td>
						<td>g</td>
						<td>h</td>
						<td>i</td>
						<td>j</td>
						<td>k</td>
						<td>l</td>
					</tr>
					<tr>
						<td>a</td>
						<td>b</td>
						<td>c</td>
						<td>d</td>
						<td>e</td>
						<td>f</td>
						<td>g</td>
						<td>h</td>
						<td>i</td>
						<td>j</td>
						<td>k</td>
						<td>l</td>
					</tr>
					<tr>
						<td>a</td>
						<td>b</td>
						<td>c</td>
						<td>d</td>
						<td>e</td>
						<td>f</td>
						<td>g</td>
						<td>h</td>
						<td>i</td>
						<td>j</td>
						<td>k</td>
						<td>l</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>

	<script type="text/javascript" src="/resources/js/jquery/jquery-1.6.min.js"></script>
	<script type="text/javascript">
		(function() {
			var demo, fixedTable;

			fixedTable = function(el) {
				var $body, $header, $sidebar;
				$body = $(el).find('.fixedTable-body');
				$sidebar = $(el).find('.fixedTable-sidebar table');
				$header = $(el).find('.fixedTable-header table');
				return $($body).scroll(
						function() {
							$($sidebar).css('margin-top', -$($body).scrollTop());
							return $($header).css('margin-left', -$($body).scrollLeft());
						});
			};

			demo = new fixedTable($('#demo'));
		}).call(this);
	</script>

</body>
</html>
