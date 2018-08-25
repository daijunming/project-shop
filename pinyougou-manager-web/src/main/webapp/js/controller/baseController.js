app.controller('baseController',function($scope){
	
	//分页控件配置
	$scope.paginationConf={
			currentPage:1,
			totalItems:10,
			itemsPerPage:10,
			perPageOptions:[10,20,30,40,50],
			onChange:function(){
				$scope.reloadList();//重新加载
			}
	};
	
	//刷新列表
	$scope.reloadList=function(){
		$scope.search($scope.paginationConf.currentPage,$scope.paginationConf.itemsPerPage);
	}
	
	
	//获取复选框id
	$scope.selectIds=[];//用户勾选的id集合
	$scope.updateSelection=function($event,id){
		if($event.target.checked){
			$scope.selectIds.push(id);//push 向集合中添加元素
		}else{
			var index=$scope.selectIds.indexOf(id);//查找参数的位置索引
			$scope.selectIds.splice(index,1);//参数1：移除的位置 参数2：移除的个数
		}
	}
	
	//json转换
	$scope.jsonToString=function(jsonString,key){
		var json =JSON.parse(jsonString);
		var value="";
		for(var i=0;i<json.length;i++){
			if(i>0){
				value += ",";
			}
			value += json[i][key];
		}
		return value;
	}
	
})
