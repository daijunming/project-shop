app.controller('brandController',function($scope,$controller,brandService){
	
	$controller('baseController',{$scope:$scope})//继承，实际是一种伪继承，利用scope的通用性实现的
	
		//查询品牌列表
		$scope.findAll=function(){
			brandService.findAll().success(
				function(response){
					$scope.list=response;
				}		
			);				
		}
		
		//分页
		$scope.findPage=function(page,rows){
			brandService.findPage(page,rows).success(
				function(response){
					$scope.list=response.rows;//显示当前页数据
					$scope.paginationConf.totalItems=response.total;
				}	
			);
		}
		
		//保存
		$scope.save=function(){
			/* var methodName='add';
			if($scope.entity.id != null){
				methodName='update'
			}
			$http.post('../brand/'+methodName+'.do',$scope.entity).success(
				function(response){
					if(response.success){
						$scope.reloadList();
					}else{
						alert(response.message)
					}
				}		
			); */
			
			var serviceObject;//服务层对象
			if($scope.entity.id!=null){
				serviceObject=brandService.update($scope.entity)//修改
			}else{
				serviceObject=brandService.add($scope.entity);//新增
			}
			
			serviceObject.success(
					function(response){
						if(response.success){
							$scope.reloadList();//重新加载
						}else{
							alert(response.message);
						}
				})
		};
		
		//查询实体
		$scope.findOne=function(id){
			brandService.findOne(id).success(
				function(response){
					$scope.entity=response;
				}		
			)
		};
		
		
		$scope.dele=function(){
			if(confirm('确定要删除吗？')){
				brandService.dele($scope.selectIds).success(
						function(response){
							if(response.success){
								$scope.reloadList();//刷新
							}else{
								alert(response.message)
							}
						}		
					)
				}
			}
		
		$scope.searchEntity={};//定义搜索对象
		//条件查询
		$scope.search=function(page,rows){
			brandService.search(page,rows,$scope.searchEntity).success(
				function(response){
					$scope.list=response.rows;
					$scope.paginationConf.totalItems=response.total;
				}	
			)
		}
		
	});