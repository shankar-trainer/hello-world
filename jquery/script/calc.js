$(function(){
  $('#sum').click(
    function(){
        $('#n3').val(parseFloat($('#n1').val())+parseFloat($('#n2').val()))
      }
  )
  $('#sub').click(
    function(){
        $('#n3').val(parseFloat($('#n1').val())-parseFloat($('#n2').val()))
      }
  )
})