import chess

board = chess.Board()
print(board.legal_moves)  

board.push_san("e4")
print(f"{board}\n")
board.push_san("e5")
print(f"{board}\n")
board.push_san("Qh5")
print(f"{board}\n")
board.push_san("Nc6")
print(f"{board}\n")
board.push_san("Bc4")
print(f"{board}\n")
board.push_san("Nf6")
print(f"{board}\n")
board.push_san("Qxf7")
print(f"{board}\n")

if board.is_checkmate():
    print("Scholars mate!")

print(type(board))